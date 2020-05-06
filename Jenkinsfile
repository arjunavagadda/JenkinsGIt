pipeline {
   agent any

   stages {
      stage('Hello') {
         steps {
            echo 'Hello World'
         }
      }
   }
   post{
      always{
         echo 'post script always executed irrespective of build status'
      }
   }
}
