pipeline {
    agent any

    environment{
        new_version = '1.0.3'
    }

    stages {
        stage('build') {
            steps {
                echo 'building the app'
                echo '${new_version}'
            }
        }
        stage('test')
        {
            steps {
                echo 'test phase '
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy '
            }
        }
    }
    post {
        always {
            echo 'post script always executed irrespective of build status'
        }
    }
}
