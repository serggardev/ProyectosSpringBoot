/*Crear un DTO (Data Transfer Object) para solicitudes de creación de usuarios, 
haciendo que la seguridad del usuario sea más robusta,
evitando exponer directamente la entidad User.
*/

package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CreateUserRequest {

    
    private String userName;
    private String email;
    private String password;
}

