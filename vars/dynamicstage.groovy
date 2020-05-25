@Grab('com.xlson.groovycsv:groovycsv:1.0')
import static com.xlson.groovycsv.CsvParser.parseCsv

def call(){

     def request = libraryResource 'demo.csv'
     println "${request}"

     def data = parseCsv(request)

     for(line in data) {
    println "${line}"
    }


}





