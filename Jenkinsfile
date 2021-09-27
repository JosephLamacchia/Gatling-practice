pipeline {
    agent any
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package -e'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test -Dgatling.simulationClass=C:/Users/josep/IdeaProjects/Gatling-practice/gatlingjenkinspractice/src/test/scala/simulations/gatlingjenkinstestsim.scala -e'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}
