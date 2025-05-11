package com.example.goorm_back.controller;

import com.example.goorm_back.dto.MakeClazzReservationRequestDto;
import com.example.goorm_back.dto.SaveClazzRequestDto;
import com.example.goorm_back.service.ClazzService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/api/clazz")
@RequiredArgsConstructor
public class ClazzController {

    private final ClazzService clazzService;

    @PostMapping("/saveClazz")
    public void saveClazz(@RequestBody SaveClazzRequestDto saveClazzRequestDto){
        clazzService.saveClazz(saveClazzRequestDto);
    }

    @PostMapping("/makeClazzReservation")
    public void makeClazzReservation(@RequestBody MakeClazzReservationRequestDto makeClazzReservationRequestDto){
        clazzService.makeClazzReservation(makeClazzReservationRequestDto);
    }

}
