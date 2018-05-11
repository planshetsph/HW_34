package core;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Subtract4ParameterizedTest {

	@Parameters(name = "Parameter # {index}: {1} - {2} - {3} - {4} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays
				.asList(new Double[][] { 
					{ 990.0, 1000.0, 2.0, 2.0, 6.0 },
					{ -20.0, 2.0, 3.0, 9.0, 10.0 },
					{ 20.0, 32.0, 4.0, 3.0, 5.0 },
					{ 23.0, 41.0, 5.0, 6.0, 7.0 },
				});
	}

	@Parameter(value = 0)
	public Double expected;

	@Parameter(value = 1)
	public Double first;

	@Parameter(value = 2)
	public Double second;
	
	@Parameter(value = 3)
	public Double third;
	
	@Parameter(value = 4)
	public Double fourth;

	@Test
	public void add() {
		assertEquals("Incorrect result", Calculator.subtract(first, second, third, fourth), expected, 0.09);
	}
}
