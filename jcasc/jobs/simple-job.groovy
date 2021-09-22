job("DevOpsSchool/simple-job") {
    description()
    keepDependencies(false)
    disabled(false)
    concurrentBuild(false)
    steps {
        shell("echo 0")
    }
}
