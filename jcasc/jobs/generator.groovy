job("DevOpsSchool/generator") {
    description()
    keepDependencies(false)
    disabled(false)
    concurrentBuild(false)
    steps {
        dsl {
            text("""pipelineJob("DevOpsSchool/pipeline-02") {
    description()
    keepDependencies(false)
    definition {
        cps {
        sandbox (true)
        script(
\"\"\"pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('First stage') {
            steps {
                sh 'echo This is bash'
            }
        }
     }
}\"\"\")
        }
    }
    disabled(false)
}""")
            ignoreExisting(false)
            removeAction("IGNORE")
            removeViewAction("IGNORE")
            lookupStrategy("JENKINS_ROOT")
        }
    }
}