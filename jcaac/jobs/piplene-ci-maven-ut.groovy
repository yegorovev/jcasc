pipelineJob("DevOpsSchool/piplene-ci-maven-ut") {
    description()
    keepDependencies(false)
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github("yegorovev/devopsschool", "https")
                    }
                    branch("main")
                }
            }
            scriptPath("jenkins-pipelines-utests/Jenkinsfile.groovy")
        }
    }
    disabled(false)
}
