package com.renovavision.kotlinmvvm.data.remote

import com.renovavision.kotlinmvvm.domain.model.User
import io.reactivex.Single

/**
 * Created by Alexandr Golovach on 13.02.2018.
 */

class Api {

    fun fetchUsers(): Single<MutableList<User>> {
        val mutableList = mutableListOf<User>()

        mutableList.add(User(1, "FirstName1", "LastName1",
                "http://www.ville-croix.fr/var/ptic/storage/images/media/caroussel-page-d-accueil/image-test-1/96100-1-fre-FR/Image-test-1_large.jpg"))
        mutableList.add(User(2, "FirstName2", "LastName2", "http://hanassets.nd.gov/images/product/test.png"))
        mutableList.add(User(3, "FirstName3", "LastName3", "https://it.testsworld.net/files/2013/07/test.jpg"))
        mutableList.add(User(4, "FirstName4", "LastName4", "http://perangustaadaugusta.altervista.org/wp-content/uploads/2017/03/test-big-1.png"))
        mutableList.add(User(5, "FirstName5", "LastName5", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd20d5uTTvOJ6kT7ANcGPb3iNnOcMfTDAtEVUrvTlOrRrzyTuE5w"))

        return Single.just(mutableList);
    }

}