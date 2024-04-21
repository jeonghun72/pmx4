package com.pmx.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter @Setter
public class MemberFormDto {

    @NotBlank(message = "권한 구분은 필수 입니다.")
    private String membType;

    @NotBlank(message = "성명은 필수 입력 값입니다.")
    private String membNm;

    @NotBlank(message = "성별 입력은 필수 입니다.")
    private String membSexCd;

    @NotBlank(message = "생년월일은 필수 입니다.")
    private String membBirth1;
    @NotBlank(message = "생년월일은 필수 입니다.")
    private String membBirth2;
    @NotBlank(message = "생년월일은 필수 입니다.")
    private String membBirth3;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String membTel1;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String membTel2;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String membTel3;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String membEmail;

    @NotBlank(message = "우편번호 필수 입력 값입니다.")
    private String membZip;

    @NotBlank(message = "주소는 필수 입력 값입니다.")
    private String membAddr;

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String membUserId;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요")
    private String membUserPw;
}