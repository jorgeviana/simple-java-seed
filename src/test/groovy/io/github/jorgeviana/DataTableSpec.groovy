package io.github.jorgeviana

import spock.lang.Specification
import spock.lang.Unroll

class DataTableSpec extends Specification {

    @Unroll("max of #a and #b is #max")
    def "maximum of two numbers"(int a, int b, int max) {
        expect:
        Math.max(a, b) == max

        where:
        a | b | max
        1 | 1 | 1
        1 | 9 | 9
        8 | 2 | 8
        9 | 9 | 9
    }
}
