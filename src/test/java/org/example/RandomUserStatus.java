package org.example;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import org.apache.http.HttpStatus;
import org.junit.Test;

public class RandomUserStatus
{

    RandomUserURL url = new RandomUserURL();
    String urlBase = url.urlProducao();

    @Test
    public void retornarListaVinteUsuarios()
    {
        given().
                param("results", 20).
                when().
                get(urlBase).
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void retornarUsuarioNacionalidadeBrasileiro() {
        given().
                param("nat", "BR").
                when().
                get(urlBase).
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void retornarUsuarioNacionalidadeDefinida() {
        given().
                param("nat", "br,us,es,ca").
                when().
                get(urlBase).
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void retornarUsuarioPaginaDefinida() {
        given().
                param("page", "3").
                when().
                get(urlBase).
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void retornarApenasDadosNomeEmail() {
        given().
                param("inc", "name, email").
                when().
                get(urlBase).
                then().
                statusCode(HttpStatus.SC_OK);
    }
}
