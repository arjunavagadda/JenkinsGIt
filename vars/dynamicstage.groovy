@Grab('com.xlson.groovycsv:groovycsv:1.0')
import static com.xlson.groovycsv.CsvParser.parseCsv

def call(){

     def request = libraryResource 'demo.csv'
     println "${request}"

     def data = parseCsv(csv, readFirstLine:true,
                    columnNames:['FirstName
', 'Country'])

     for(line in data) {

    println "$line.FirstName ${line[1]}"

    }


}





