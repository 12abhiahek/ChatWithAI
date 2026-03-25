package com.chat.AI.chatAI.repository;

import com.chat.AI.chatAI.entity.ChatMessage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Chatrepository extends JpaRepository<Long, ChatMessage> {

    List<ChatMessage> findBySessionIdOrderByCreatedAtAsc(String sessionId);

}
