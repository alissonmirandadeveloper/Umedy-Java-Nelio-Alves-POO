package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoComDataHora {
    public static void main(String[] args) {

        LocalDate data = LocalDate.parse("2022-07-20");
        LocalDateTime dataHora =  LocalDateTime.parse("2022-07-20T01:30:26");
        Instant global = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = data.minusDays((7));
        LocalDate nextWeekLocalDate = data.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = dataHora.minusDays((7));
        LocalDateTime nextWeekLocalDateTime = dataHora.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = global.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = global.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), data.atTime(0,0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, dataHora);
        Duration t3 = Duration.between(pastWeekInstant, global);
        Duration t4 = Duration.between(global, pastWeekInstant);

        System.out.println("t1 dias " + t1.toDays());
        System.out.println("t2 dias " + t2.toDays());
        System.out.println("t3 dias " + t3.toDays());
        System.out.println("t4 dias " + t4.toDays());

    }
}
