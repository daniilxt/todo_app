package com.daniilxt.fragments.list

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.daniilxt.todo_app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        //used that, while dint know view binding
        view.findViewById<FloatingActionButton>(R.id.list_frg__fab).setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }
        view.findViewById<View>(R.id.list_frg__layout).setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
        }
        setHasOptionsMenu(true)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_frg__menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}