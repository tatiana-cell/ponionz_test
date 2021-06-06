package simplon.com.ponionz.services;

import org.springframework.stereotype.Service;

import simplon.com.ponionz.domaine.dto.DemandeCreate;

@Service
public class DemandeServiceImpl implements DemandeService {

    @Override
    public void create(DemandeCreate demande) {
	System.out.println("La periode pour laquelle demande a été faite est " + demande.getPeriod() + " années");
	System.out.println(demande.toString());
    }

}
