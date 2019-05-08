package org.neomatrix369.salaryslip;

import junit.framework.TestCase;
import org.junit.Test;

public class SalarySlipGeneratorTest {

    @Test
    public void testCalculateNationalInsuranceAnnualGrossSalaryOf45000() {

        TestCase.assertEquals(352.73, SalarySlipGenerator.calculateNationalInsurance(45000));

    }
}