pipelineJob("DevOpsSchool/piplene-ci-maven-ut") {
    description()
    keepDependencies(false)
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github("yegorovev/draft", "https")
                    }
                    branch("main")
                }
            }
            scriptPath("jenkins-pipelines-utests/Jenkinsfile.groovy")
        }
    }
    disabled(false)
}
