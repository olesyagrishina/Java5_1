import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.RestCalculate;

public class RestCalculateTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestCalculate.csv")
    public void Calculate1(int expected, int income, int expenses, int threshold) {
        RestCalculate service = new RestCalculate();
        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void Calculate2() {
    //RestCalculate service = new RestCalculate();
    //int expected = 2;
    //int actual = service.calculate(100_000, 60_000, 150_000);

    //Assertions.assertEquals(expected, actual);
}

