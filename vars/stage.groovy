def call(Map params = [:]) {

    println("Before stage call")
    def result = steps.stage(params)
    println("After stage call")
    return result

}
