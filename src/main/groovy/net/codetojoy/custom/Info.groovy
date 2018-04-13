
package net.codetojoy.custom

import net.codetojoy.utils.Utils

class Info {
    def party = ""
    def firstName = ""
    def lastName = ""
    def city = ""
    def total = 0

    static def utils = new Utils()

    static String getHeader() {
        utils.buildList(["Party", "Last Name", "First Name", "City", "Total"])
    }

    String toString() {
        utils.buildList([party, lastName, firstName, city, total])
    }
}
