import groovy.json.JsonSlurper



def call(){
     
     job = "${JOB_NAME}".toString()


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)
     
     println "jenkins job name" + job.getClass() 
     
     
     
     res = InputJSON.Person.Age
     
      println "result without jenkins" + res
     
     result = InputJSON.job.Age
     
   
     
     println "req" + result

     

}
