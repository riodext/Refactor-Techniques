# Extract and Override Call
Dependency breaking technique

### It is an ideal way to break dependencies on global variables and static methods.

Use it unless there are many different calls against the same global. If there are, often use Replace Global Reference with Getter instead. 

## Scenario
 
A call to a static method.

```
class CouponPresenter {

    private var couponsList = listOf("Coupon 1", "Coupon 2")

    fun setup() {
        CouponUtils.formatCoupons(couponsList)
    }
}
```


## Steps

If you have an automated refactoring tool, Extract and Override Call is trivial. You can do it using the Extract Method refactoring. However, if you don’t, use the following steps. They allow you to extract any call safely, even if you don’t have tests in place.

Identify the call that you want to extract. Find the declaration of its method. Copy its method signature so that you can Preserve Signatures. 

Create a new method on the current class. Give it the signature you’ve copied. 

Copy the call to the new method and replace the call with a call to the new method.

