package Software;
import java.util.Scanner;

import Entidades.*;

public class app {
    public static void main(String[] args) {
        System.out.println("BEM VINDO A CLINICA VETERINARIA PET DREAM!!!");
        System.out.printf("\n");
        System.out.printf("\n");
        Animal p1 = new Animal();
        Dono p2 = new Dono();
        Consulta p3 = new Consulta();
        Sintomas p4 = new Sintomas();
        Veterinario p5 = new Veterinario();

        p1.setNome_animal("Bob");
        p1.setRaca("Lhasa Apso");
        p1.setEspecie("Canis");
        p1.setIdade("12");
        p1.setPeso("15");
        p1.setPelagem("Bege");
        p1.setSexo("Masculino");
        p1.setProcedencia("Casa");

        System.out.printf("O nome do animal é: %s",p1.getNome_animal());
        System.out.printf("\n");
        System.out.printf("A raça é: %s",p1.getRaca());
        System.out.printf("\n");
        System.out.printf("A especie do animal é: %s",p1.getEspecie());
        System.out.printf("\n");
        System.out.printf("A idade do animal é: %s",p1.getIdade());
        System.out.printf("\n");
        System.out.printf("O peso do animal é: %s",p1.getIdade());
        System.out.printf("\n");
        System.out.printf("A pelagem do animal é: %s",p1.getPelagem());
        System.out.printf("\n");
        System.out.printf("O sexo do animal é: %s",p1.getSexo());
        System.out.printf("\n");
        System.out.printf("A procedencia do animal é: %s",p1.getProcedencia());
        System.out.printf("\n");
        System.out.printf("\n");



        p2.setNome_dono("Diogo");
        p2.setCelular("986060610");
        p2.setCidade("João Pessoa");
        p2.setUf("Manaira");
        p2.setCpf("123455-333");
        p2.setTelefone_fixo("3322211");
        System.out.printf("O nome do dono do animal é: %s",p2.getNome_dono());
        System.out.printf("\n");
        System.out.printf("O telefone do responsavel do animal é: %s",p2.getCelular());
        System.out.printf("\n");
        System.out.printf("A cidade do cliente é: %s",p2.getCidade());
        System.out.printf("\n");
        System.out.printf("O bairro é: %s",p2.getUf());
        System.out.printf("\n");
        System.out.printf("O cpf é : %s",p2.getCpf());
        System.out.printf("\n");
        System.out.printf("O telefone fixo é: %s",p2.getTelefone_fixo());
        System.out.printf("\n");
        System.out.printf("\n");

        p3.setQueixa("Animal triste");
        p3.setVacinacao (false);
        p3.setHistorico("Pneumonia");
        p3.setAlimentacao("Restritiva a rações anti-alergicas");
        p3.setAmbiente("Casa");
        p3.setVermifugacao(false);
        p3.setContactantes("Diogo,Diego,Dany");


        System.out.printf("A queixa é: %s",p3.getQueixa());
        System.out.printf("\n");
        System.out.printf("",p3.getVacinacao());
        System.out.printf("",p3.getVermifugacao());
        System.out.printf("O ambiente: %s",p3.getAmbiente());
        System.out.printf("\n");
        System.out.printf("O historico é de: %s",p3.getHistorico());
        System.out.printf("\n");
        System.out.printf("Os contactantes: %s",p3.getContactantes());
        System.out.printf("\n");
        System.out.printf("A alimentação do animal é de : %s",p3.getAlimentacao());
        System.out.printf("\n");

        p4.setOlhos(true);
        p4.setSistema_digestivo(true);
        p4.setPele(false);
        p4.setSistema_neurologico(true);
        p4.setSistema_reprodutor(true);
        p4.setSistema_respiratorio(true);
        p4.setSistema_urinario(true);

        System.out.printf("",p4.getOlhos());
        System.out.printf("\n");

        System.out.printf("",p4.getSistema_digestivo());
        System.out.printf("\n");
        System.out.printf("",p4.getPele());
        System.out.printf("\n");
        System.out.printf("",p4.getSistema_neurologico());
        System.out.printf("\n");
        System.out.printf("",p4.getSistema_reprodutor());
        System.out.printf("\n");
        System.out.printf("",p4.getSistema_urinario());
        System.out.printf("\n");
        System.out.printf("",p4.getSistema_respiratorio());
        System.out.println("\n");

        p5.setCrvm("145634");
        p5.setCpf("13331");
        p5.setEndereco("Avenida 1233");
        p5.setNome("Diogo");
        p5.setNumero("13344");
            
        System.out.printf("A CRVM do Veterinario é: %s",p5.getCrvm());
        System.out.println("\n");
        System.out.printf("Veterinario cadastrado em cpf: %s",p5.getCpf() );
        System.out.println("\n");
        System.out.printf("O endereço cadastrado é: %s",p5.getEndereco());
        System.out.println("\n");
        System.out.printf("O nome do veterinario é: %s",p5.getNome());
        System.out.println("\n");
        System.out.printf("O número de contato para o veterinario é: ",p5.getNumero());









    }
}

