package br.ce.wcaquino.taskbackend.utils;

import br.ce.wcaquino.taskbackend.utils.DateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas() {
        LocalDate date = LocalDate.of(2030,01,01);
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDataPresente() {
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalseParaDataPassada() {
        LocalDate date = LocalDate.of(2000,01,01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }
}
