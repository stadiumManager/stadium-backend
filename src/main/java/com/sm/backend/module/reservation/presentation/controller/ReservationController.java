package com.sm.backend.module.reservation.presentation.controller;

import com.sm.backend.common.response.BaseResponse;
import com.sm.backend.module.member.presentation.dto.MemberDto;
import com.sm.backend.module.reservation.domain.entity.Reservation;
import com.sm.backend.module.reservation.presentation.dto.ReservationDto;
import com.sm.backend.module.reservation.domain.service.ReservationService;
import com.sm.backend.module.stadium.domain.entity.ReservableStadium;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/reservation")
@RestController
public class ReservationController {

    private final ReservationService reservationService;

    // 1. API Spec 을 정의
    @PostMapping("/reserve")
    public ResponseEntity reserve(@Validated @RequestBody ReservationDto.CreateRequest request) {
        var response = reservationService.reserve(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(BaseResponse.success(response));
    }

    @GetMapping("/reserve/{id}")
    public BaseResponse<ReservationDto.FindResponse> findById(@PathVariable Long id) {
        return BaseResponse.success(reservationService.findById(id));
    }

}