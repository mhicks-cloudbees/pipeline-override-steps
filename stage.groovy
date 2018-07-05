def call(String name) {

    println("Before stage call")
    def result = steps.stage(name)
    println("After stage call")
    return result

}
