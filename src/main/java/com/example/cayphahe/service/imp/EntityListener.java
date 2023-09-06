package com.example.cayphahe.service.imp;

import com.example.cayphahe.model.People;
import com.example.cayphahe.model.ReferencePeople;
import com.example.cayphahe.repository.IPeopleRepository;
import com.example.cayphahe.repository.IReferenceRepository;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Ref;

@Service
@Data
@NoArgsConstructor
public class EntityListener {
    @Autowired
    private  IPeopleRepository peopleRepository;

    @PrePersist
    @PreUpdate
    public void synchronizeTable2(People people) {
        ReferencePeople ref = new ReferencePeople();
        ref.setId(people.getId());

        // Copy other fields if needed

        peopleRepository.save(people);
    }

    @PreRemove
    public void removeFromTable2(People people) {
        peopleRepository.deleteById(people.getId());
    }

}
