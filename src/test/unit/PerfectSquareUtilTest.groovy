import com.alphacoder.PerfectSquareUtil
import spock.lang.Specification

class PerfectSquareUtilTest extends Specification{
    def 'Test PerfectSquareUtil | isPerfectSquare() | input number is 0'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare(0)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare() | input number is 1'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare(1)

        then:
        result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare() | input number is 12'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare(12)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare() | input number is 25'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare(25)

        then:
        result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare1() | input number is 0'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare1(0)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare1() | input number is 1'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare1(1)

        then:
        result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare1() | input number is 12'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare1(12)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquare1() | input number is 25'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquare1(25)

        then:
        result
    }

    def 'Test PerfectSquareUtil | isPerfectSquareBinary() | input number is 0'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquareBinary(0)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquareBinary() | input number is 1'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquareBinary(1)

        then:
        result
    }

    def 'Test PerfectSquareUtil | isPerfectSquareBinary() | input number is 12'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquareBinary(12)

        then:
        !result
    }

    def 'Test PerfectSquareUtil | isPerfectSquareBinary() | input number is 25'(){
        given:
        def obj= new PerfectSquareUtil()

        when:
        def result= obj.isPerfectSquareBinary(25)

        then:
        result
    }
}
