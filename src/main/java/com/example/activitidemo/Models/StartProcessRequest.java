package com.example.activitidemo.Models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

import static com.example.activitidemo.Constants.*;

@Data
public class StartProcessRequest {

    @NotNull(message=EMPLOYEE_NAME_REQUIRED)
    String employeeName;

    @NotNull(message=VACATION_REQUEST_REQUIRED)
    String vacationMotivation;


    @NotNull(message=VACATION_MOTIVATION_REQUIRED)
    String noOfDays;

    @NotNull(message=FIRST_DAY_OF_HOLIDAY_REQUIRED)
    Date firstDayOfHoliday;


    public StartProcessRequest() {}
}
