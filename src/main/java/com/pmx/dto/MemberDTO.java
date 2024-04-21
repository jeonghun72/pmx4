package com.pmx.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class MemberDTO
{
    @NotBlank(message = "권한 구분은 필수 입니다.")
    private String memType;

    @NotBlank(message = "성명은 필수 입력 값입니다.")
    private String memNm;

    @NotBlank(message = "성별 입력은 필수 입니다.")
    private String memSex;

    @NotBlank(message = "생년월일은 필수 입니다.")
    private String memBirth1;
    @NotBlank(message = "생년월일은 필수 입니다.")
    private String memBirth2;
    @NotBlank(message = "생년월일은 필수 입니다.")
    private String memBirth3;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String memTel1;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String memTel2;

    @NotBlank(message = "연락처는 필수 입력 값입니다.")
    private String memTel3;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String memEmail;

    @NotBlank(message = "우편번호 필수 입력 값입니다.")
    private String memZip;

    @NotBlank(message = "주소는 필수 입력 값입니다.")
    private String memAddr;

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String memUserId;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요")
    private String memUserPw;
}
