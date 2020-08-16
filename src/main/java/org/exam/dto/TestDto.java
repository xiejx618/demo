package org.exam.dto;

public class TestDto extends BaseDto{
    private UserDto userDto;
    public UserDto getUserDto() {
        return userDto;
    }
    public TestDto setUserDto(UserDto userDto) {
        this.userDto = userDto;
        return this;
    }
}
