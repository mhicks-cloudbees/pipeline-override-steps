def call(String name, Object block) {

    println("Before stage call")
    def result = steps.stage(name, block)
    println("After stage call")
    return result

}
