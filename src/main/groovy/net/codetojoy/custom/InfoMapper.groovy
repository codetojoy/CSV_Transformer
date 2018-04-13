
package net.codetojoy.custom

import net.codetojoy.utils.Utils

class InfoMapper {
    static final def INDEX_FIRST_NAME = 0
    static final def INDEX_LAST_NAME = 1
    static final def INDEX_CITY = 2
    static final def INDEX_TOTAL = 3

    def party
    def utils = new Utils()

    def mapLine = { def line ->
        def info = null 

        try {
            def firstName = line.getAt(INDEX_FIRST_NAME)
            def lastName = line.getAt(INDEX_LAST_NAME)
            def city = line.getAt(INDEX_CITY)
            def total = utils.cleanTotal(line.getAt(INDEX_TOTAL))

            if (firstName || lastName) {
                info = new Info(party: party, firstName: firstName, 
                                lastName: lastName, city: city, 
                                total: total) 
            } else {
                System.err.println "TRACER: skipping " + line
            }
        } catch(Exception ex) {
            System.err.println("TRACER caught ex : ${ex.message}")
        }

        return info
    }
}

