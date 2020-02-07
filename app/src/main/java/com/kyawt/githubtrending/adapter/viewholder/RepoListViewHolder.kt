package com.kyawt.githubtrending.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.kyawt.githubtrending.BR
import com.kyawt.githubtrending.databinding.ItemRepoListBinding
import com.kyawt.githubtrending.model.Item
import com.kyawt.githubtrending.ui.repolist.RepoListViewModel
import kotlinx.android.synthetic.main.item_repo_list.view.*


class RepoListViewHolder constructor(
    private val dataBinding : ItemRepoListBinding, private val repoListViewModel: RepoListViewModel
): RecyclerView.ViewHolder(dataBinding.root){

    val avatarImage = itemView.itemAvatar
    fun setup(itemData:Item){
        dataBinding.setVariable(BR.itemData, itemData)
    }
}