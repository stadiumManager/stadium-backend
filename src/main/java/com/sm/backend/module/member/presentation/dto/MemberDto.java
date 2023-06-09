package com.sm.backend.module.member.presentation.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sm.backend.module.member.domain.entity.Level;
import com.sm.backend.module.member.domain.entity.Manner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class MemberDto {
    @Getter
    @SuperBuilder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BaseResponse {
        private Long id;

        @JsonProperty(value = "member_name")
        private String name;

        private String nickname;

        private char gender;

        private LocalDate brith;

        private Level level;

        private Manner manner;

        private String coupon;

        private BigDecimal point;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateRequest {
        @NotNull
        private String name;

        private String nickname;

        private char gender;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private LocalDate birth;

        private Level level;

        private Manner manner;

        private String coupon;

        private BigDecimal point;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateResponse {
        private Long id;
    }

    @Getter
    @SuperBuilder
    @AllArgsConstructor
    public static class FindResponse {
        private Long id;
    }
}
