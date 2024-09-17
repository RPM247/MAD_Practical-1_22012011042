fun main(){
    var a=24
    var b=7
    print("With using third variable:\n")
    print("Before swapping:\n")
    print("The value of a is $a and b is $b\n")
    var c=a
    a=b
    b=c
    print("After swapping:\n")
    print("The value of a is $a and b is $b\n")
    print("\nWithout using third variable:\n")
    print("With using third variable:\n")
    print("Before swapping:\n")
    print("The value of a is $a and b is $b\n")
    a=a+b
    b=a-b
    a=a-b
    print("After swapping:\n")
    print("The value of a is $a and b is $b")
}