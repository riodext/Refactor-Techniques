# Extract and Override Call
Dependency breaking technique

### It is an ideal way to break dependencies on global variables and static methods.

Use it unless there are many different calls against the same global. If there are, often use Replace Global Reference with Getter instead. 

## Scenario

PageLayout makes a call to a static function named formStyles on a class named StyleMaster. It assigns the return value to an instance variable: styles. 

```
class PageLayout {

    private val id = 0
    private var styles = listOf<String>()
    private val template = StyleTemplate()

    fun rebindStyles() {
        styles = StyleMaster.formStyles(template, id)
    }
}
```
## Solution

What can we do if we want to sense through formStyles or separate our dependency on StyleMaster? One option is to extract the call to a new method and override it in a testing subclass. This is known as Extract and Override Call.
```
open class PageLayout_solution {

private val id = 0
    private var styles = listOf<String>()
    private val template = StyleTemplate()

    fun rebindStyles() {
        styles = formStyless(template, id)
    }

    protected open fun formStyless(
        template: StyleTemplate,
        id: Int
    ): List<String> {
        return StyleMaster.formStyles(template, id)
    }
}
```
Now that we have our own local formStyles method, we can override it to break the dependency.

As we develop tests that need various styles, we can alter this method so that we can configure what will be returned:

```
class FakePageLayout : PageLayout_solution() {

    override fun formStyless(
        template: StyleTemplate,
        id: Int
    ): List<String> {
        return listOf(
            "Testing Style 1", "Testing Style 2"
        )
    }
}
```
## Test
```
class PageLayoutTestSolution {

    private lateinit var pageLayout: FakePageLayout

    @Before
    fun setUp() {
        pageLayout = FakePageLayout()
    }
}
```
## Steps

If you have an automated refactoring tool, Extract and Override Call is trivial. You can do it using the Extract Method refactoring. However, if you don’t, use the following steps. They allow you to extract any call safely, even if you don’t have tests in place.

Identify the call that you want to extract. Find the declaration of its method. Copy its method signature so that you can Preserve Signatures. 

Create a new method on the current class. Give it the signature you’ve copied. 

Copy the call to the new method and replace the call with a call to the new method.

