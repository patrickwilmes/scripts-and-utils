class MyTestEvent (
    val constructorProperty: String,
) {
    val myLazyProperty by lazy { "Hello" }
}
