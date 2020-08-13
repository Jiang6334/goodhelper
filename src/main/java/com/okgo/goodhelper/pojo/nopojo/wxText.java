package com.okgo.goodhelper.pojo.nopojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class wxText implements List<wxText> {
    private String filename;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<wxText> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(wxText wxText) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends wxText> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends wxText> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public wxText get(int index) {
        return null;
    }

    @Override
    public wxText set(int index, wxText element) {
        return null;
    }

    @Override
    public void add(int index, wxText element) {

    }

    @Override
    public wxText remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<wxText> listIterator() {
        return null;
    }

    @Override
    public ListIterator<wxText> listIterator(int index) {
        return null;
    }

    @Override
    public List<wxText> subList(int fromIndex, int toIndex) {
        return null;
    }
}
