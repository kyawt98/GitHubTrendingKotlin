package com.kyawt.githubtrending.ui.repolist


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kyawt.githubtrending.R

/**
 * A simple [Fragment] subclass.
 */
class RepoListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_repo_list, container, false)
    }

}
