
package net.codetojoy.custom

class Info {
    def party = ""
    def firstName = ""
    def lastName = ""
    def city = ""
    def total = 0

    static String q(def s) {
        def dq = '"'
        return "${dq}${s}${dq}"
    }

    static String getHeader() {
        return "${q("Party")},${q("Last Name")},${q("First Name")},${q("City")},${q("Total")}"
    }

    String toString() {
        return "${q(party)},${q(lastName)},${q(firstName)},${q(city)},${q(total)}"
    }
}

