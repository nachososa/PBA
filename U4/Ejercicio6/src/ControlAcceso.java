
import java.util.HashSet;
import java.util.Set;

public class ControlAcceso {

    private Set<String> abonados;
    private Set<String> invitados;
    private Set<String> menoresEdad;

    public ControlAcceso(Set<String> abonados, Set<String> invitados, Set<String> menoresEdad) {
        this.abonados = abonados;
        this.invitados = invitados;
        this.menoresEdad = menoresEdad;
    }

    public Set<String> ingresarSinRestriccion() {
        return new HashSet<>(abonados);
    }

    public Set<String> ingresarConRestriccion() {
        Set<String> puedenAcompañar = new HashSet<>();
        puedenAcompañar.addAll(abonados);
        puedenAcompañar.addAll(invitados);

        if (puedenAcompañar.isEmpty()) {
            return new HashSet<>(); // nadie para acompañar
        }
        return new HashSet<>(menoresEdad);
    }

    public Set<String> noIngresan(Set<String> personasQueQuierenEntrar) {
        Set<String> puedenEntrar = new HashSet<>();
        puedenEntrar.addAll(ingresarSinRestriccion());
        puedenEntrar.addAll(ingresarConRestriccion());

        Set<String> noAutorizadas = new HashSet<>(personasQueQuierenEntrar);
        noAutorizadas.removeAll(puedenEntrar);
        return noAutorizadas;
    }

    public Set<String> getAbonados() {
        return abonados;
    }

    public void setAbonados(Set<String> abonados) {
        this.abonados = abonados;
    }

    public Set<String> getInvitados() {
        return invitados;
    }

    public void setInvitados(Set<String> invitados) {
        this.invitados = invitados;
    }

    public Set<String> getMenoresEdad() {
        return menoresEdad;
    }

    public void setMenoresEdad(Set<String> menoresEdad) {
        this.menoresEdad = menoresEdad;
    }
}
