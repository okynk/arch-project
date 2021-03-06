/*
 * Copyright (c) 2018 Oky Nugroho Kusumo - Open Source Project
 */

package com.okynk.archproject.core.datasource.general

import com.okynk.archproject.core.api.model.post.GetProfilesPostModel
import com.okynk.archproject.core.entity.PaginatedListEntity
import com.okynk.archproject.core.entity.ProfileEntity
import io.reactivex.Completable
import io.reactivex.Observable

interface GeneralDataSource {
    fun getProfiles(postModel: GetProfilesPostModel = GetProfilesPostModel()): Observable<PaginatedListEntity<ProfileEntity>>
    fun saveProfiles(
        postModel: GetProfilesPostModel,
        data: PaginatedListEntity<ProfileEntity>
    ): Completable
    fun getProfile(): Observable<ProfileEntity>
    fun saveProfile(data: ProfileEntity): Completable
}