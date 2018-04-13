
package net.codetojoy.utils

import org.junit.*
import static org.junit.Assert.*

class UtilsTestCase {
    def utils = new Utils()

    @Test
    void cleanTotal_case1() {
        // test
        def result = utils.cleanTotal('$500.00' as String)

        assertEquals((float) 500, result, 0.0f)
    }

    @Test
    void cleanTotal_case2() {
        // test
        def result = utils.cleanTotal('"$1500.00"' as String)

        assertEquals((float) 1500, result, 0.0f)
    }
}
