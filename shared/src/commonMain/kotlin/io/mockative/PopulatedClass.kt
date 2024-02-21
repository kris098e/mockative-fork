package io.mockative

@Mocked
class PopulatedClass(
    val class2: Class2,
    val class22: Class2,
    val number: Int?,
    val s: Map<String, String>?,
    val list: List<String>,
    val sequence: List<List<List<String>>>,
    val char: CharSequence,
    val sd: String,
    val sss: BooleanArray,
    val inner: InnerClass,
    val aaa: ArrayList<String>,
    val z: ArrayDeque<String>,
    val dd: LinkedHashMap<String, String>,
    val ddd: HashMap<String, String>,
    val asa: LinkedHashSet<String>,
    val sa: HashSet<String>,
) {
    @Mocked
    class InnerClass(val s: String) {

    }
    val notConstructorParam = "notConstructorParam"

    fun greet() = "Hello"
}

@Mocked
class Class2(val class3: Class3) {
    val message1 = "message1"
    val message2 = "message2"
}

@Mocked
class Class3 {
    val message1 = "message1"
    val message2 = "message2"
}
