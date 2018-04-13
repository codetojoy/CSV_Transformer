
package net.codetojoy.utils

import java.text.NumberFormat

class Utils {
    def cleanTotal(def s) {
        def result = 0

        if (s) {
            def trimStr = s.replaceAll(/\$/, '').replaceAll('"', '').trim()
            result = NumberFormat.getInstance().parse(trimStr)
        }

        return result
    }
}
