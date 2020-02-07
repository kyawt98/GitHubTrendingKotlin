package com.kyawt.githubtrending.ui.repolist

import androidx.lifecycle.MutableLiveData
import com.kyawt.githubtrending.base.BaseViewModel
import com.kyawt.githubtrending.model.Item
import com.kyawt.githubtrending.model.api.RepoRepository

class RepoListViewModel : BaseViewModel(){
    val repoList = MutableLiveData<List<Item>>()

    fun fetchRepoList() {
        dataLoading.value = true

        RepoRepository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess){
                repoList.value = response?.items
                empty.value = false
            }else{
                empty.value = true
            }
        }
    }

}