package miu.edu.finalexam.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {
    private LocalDateTime orderDate;
    private CustomerResponseDto customerResponseDto;
    private List<ProductResponseDto> productResponseDtoList;
}
