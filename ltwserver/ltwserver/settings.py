SECRET_KEY='\x05l%\xfeY3\xb2\xf9>\xba\xd9\xbfR\x82\xa3\xfd*lX>\x8a\x11\x98\xce'
CELERY_BROKER_URL = 'amqp://guest:guest@localhost:5672/'
#CELERY_BROKER_URL = 'redis://localhost:6379/0'
CELERY_RESULT_BACKEND = 'amqp://guest:guest@localhost:5672/'
#CELERY_RESULT_BACKEND = 'redis://localhost:6379/0'
CELERY_TASK_SERIALIZER='json'
CELERY_RESULT_SERIALIZER='json'
#CELERY_TASK_RESULT_EXPIRES = 18000
CELERY_TIMEZONE = 'Europe/Madrid'
CELERY_ENABLE_UTC = True