package com.rhapplication.payroll.service.payments;

import com.rhapplication.payroll.enumeration.AcademicBackground;
import com.rhapplication.payroll.enumeration.Classes;
import com.rhapplication.payroll.model.Teacher;

public class PayTeacher {

    // calculo do pagamento
    /*
    para pagar professor preciso de:
    1. saber quem é o professor >> para pegar sua formação
    2. saber qual curso foi ministrado por este professor
    2. quantidade de horas de aula
    3. qual curso foi ministrado
    4. nivel de graduação do professor
     */

    public Teacher dadosDoProfessor(Teacher ssn){
        //buscar no banco de dados
        ssn.getAcademicBackground();
        ssn.getClasses();
        return null;
    }

    public double valorHoraAula(String curso) {
        double valor = 0.0;
        if (curso.equals(Classes.EFI)) {
            valor = 20.0;
        } else if (curso.equals(Classes.EFII)) {
            valor = 25.0;
        } else if (curso.equals(Classes.NEM)) {
            valor = 30.0;
        } else if (curso.equals(Classes.EMPROF)) {
            valor = 35.0;
        }
        return valor;
    }

    public double adicionalGraduacao(String graduacao) {
        double adicional = 0.0;
        if (graduacao.equals(AcademicBackground.GRADUATE)) {
            adicional = 1.0;
        } else if (graduacao.equals(AcademicBackground.POSTGRADUATE)) {
            adicional = 2.0;
        } else if (graduacao.equals(AcademicBackground.MASTER)) {
            adicional = 5.0;
        } else if (graduacao.equals(AcademicBackground.DOCTORADTE)) {
            adicional = 8.0;
        }
        return adicional;
    }

    public double calcularPagamento(String curso, String graduacao, int horas) {
        double valorHora = valorHoraAula(curso);
        double adicional = adicionalGraduacao(graduacao);

        //se a formação academica for graduação, não tem adicional
        if(graduacao.equals(AcademicBackground.POSTGRADUATE)){
            return valorHora * adicional * horas;
        } else if (graduacao.equals(AcademicBackground.MASTER)){
            return valorHora * adicional * horas;
        } else if (graduacao.equals(AcademicBackground.DOCTORADTE)){
            return valorHora * adicional * horas;
        } else{
            return valorHora * horas;
        }

    }





}
