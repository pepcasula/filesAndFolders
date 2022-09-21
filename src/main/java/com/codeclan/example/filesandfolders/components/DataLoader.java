package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.Person;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import com.codeclan.example.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
// @Component //comment this out if you do not need to run the Data Loader
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        Person pep = new Person("Pep");
        personRepository.save(pep);

        Person val = new Person("Val");
        personRepository.save(val);

        Person and = new Person("Andy");
        personRepository.save(and);

        Folder myDocuments = new Folder("Pep Docs", pep);
        folderRepository.save(myDocuments);

        Folder myPictures = new Folder("Pep Photos", pep);
        folderRepository.save(myPictures);

        Folder valMusic = new Folder("val Music", val);
        folderRepository.save(valMusic);

        Folder valBills = new Folder("Val Bills", val);
        folderRepository.save(valBills);

        Folder andProjects = new Folder("Andy Projects", and);
        folderRepository.save(andProjects);

        Folder andVideos = new Folder("Andy Videos", and);
        folderRepository.save(andVideos);

        File passportScan = new File("Passport Scan", ".jpg", 769, myDocuments);
        fileRepository.save(passportScan);

        File ieltsCertificate = new File("IELTS Certificate", ".pdf", 1240, myDocuments);
        fileRepository.save(ieltsCertificate);

        File lisbonSunset = new File("Sunset in Lisbon", ".jpg", 3398, myPictures);
        fileRepository.save(lisbonSunset);

        File meAndMyDog = new File("Me and my dog", ".raw", 2798, myPictures);
        fileRepository.save(meAndMyDog);

        File strawberryFields = new File("Strawberry Fields Forever", ".flac", 8322, valMusic);
        fileRepository.save(strawberryFields);

        File luna = new File("Luna", ".mp3", 1672, valMusic);
        fileRepository.save(luna);

        File mobilePhoneAugust22 = new File("Mobile Phone - August 2022", ".pdf", 540, valBills);
        fileRepository.save(mobilePhoneAugust22);

        File councilTax2021 = new File("Council Tax - Year 2021", ".pdf", 389, valBills);
        fileRepository.save(councilTax2021);

        File supercar3d = new File("Super Car 3d", ".ma", 49652, andProjects);
        fileRepository.save(supercar3d);

        File wordFlags = new File("Word Flags", ".ai", 3904, andProjects);
        fileRepository.save(wordFlags);

        File cyclingBudapest = new File("Crazy Cycling in Budapest", ".mp4", 472306, andVideos);
        fileRepository.save(cyclingBudapest);

        File walkingHighlands = new File("Walking the Highlands 2019", ".mp4", 634221, andVideos);
        fileRepository.save(walkingHighlands);
    }
}
